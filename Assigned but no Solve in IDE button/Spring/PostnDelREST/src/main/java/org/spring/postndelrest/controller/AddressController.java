package org.spring.postndelrest.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
public class AddressController {
    private ConcurrentMap<String, String> addrBook = new ConcurrentHashMap<>();

    @PostMapping("/addr")
    public void postAddress(@RequestParam String name, @RequestParam String addr) {
        addrBook.put(name, addr);
    }

    @GetMapping("addr/{name}")
    public String GetAddress(@PathVariable String name) {
        return addrBook.get(name);
    }

}
