package com.example.trabalhodaves;

import com.example.trabalhodaves.repository.AlunoRepository;
import com.example.trabalhodaves.repository.NotaRepository;
import model.Aluno;
import model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrabalhodavesApplication implements CommandLineRunner {

    @Autowired
    AlunoRepository ar;

    @Autowired
    NotaRepository nr;

    public static void main(String[] args) {
        SpringApplication.run(TrabalhodavesApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {

    Aluno a1 = new Aluno("1","Marcelo",16);
    Aluno a2 = new Aluno("2","Caio",17);
    Aluno a3 = new Aluno("3","Pedro",18);
    Aluno a4 = new Aluno("4","Pedro",18);
    Aluno a5 = new Aluno("5","Chico",20);
    Aluno a6 = new Aluno("6","João",23);

    Nota n1 = new Nota("10",a1,"Matemática",8);
    Nota n2 = new Nota("20",a2,"Ciências",9);
    Nota n3 = new Nota("30",a3,"Português",10);
    Nota n4 = new Nota("40",a2,"Português",10);
    Nota n5 = new Nota("50",a2,"Física",10);
    Nota n6 = new Nota("60",a2,"Química",10);

    ar.save(a1);
    ar.save(a2);
    ar.save(a3);
    ar.save(a4);
    ar.save(a5);
    ar.save(a6);

    nr.save(n1);
    nr.save(n2);
    nr.save(n3);
    nr.save(n4);
    nr.save(n5);
    nr.save(n6);


    }
}
