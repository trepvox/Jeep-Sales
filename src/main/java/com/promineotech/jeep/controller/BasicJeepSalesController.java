package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;

@RestController
public class BasicJeepSalesController implements JeepSalesController {

  public List<Jeep> fetchJeeps(String model) {
    // TODO Auto-generated method stub
    return null;
  }

}
