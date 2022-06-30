package com.bubble.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bubble.repo.sortinterface;

@RestController
public class sortcontroller {
@Autowired
private sortinterface obj;

@GetMapping("/bsort")
public int[]  bubsort(@RequestBody int[] arr) {
	obj.bubblesort(arr);
	return arr;
}


}
