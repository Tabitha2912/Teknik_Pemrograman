package com.W11.Tekprog.Controller;

import com.W11.Tekprog.Model.Mahasiswa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Mahasiswa")

public class MahasiswaController_imp extends StudentsController_imp<Mahasiswa> implements MahasiswaController {
    
}
