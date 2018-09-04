package com.colinriley.battleship.app.rest.resources;

/**
 * Created by criley on 9/3/18.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by criley on 2/18/18.
 */
@RestController
@RequestMapping("/api")
public class BattleshipResource {

  @RequestMapping(path = "songs", method = RequestMethod.GET)
  public ResponseEntity<?> createSession() {
//    List<Song> songs = new ArrayList<>();
//    for (Song song : this.repository.findAll()) {
//      songs.add(song);
//    }
    return new ResponseEntity<>("", HttpStatus.OK);
  }

}
