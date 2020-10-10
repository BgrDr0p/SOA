package ageservice;


import javax.jws.WebMethod;
import javax.jws.WebService;
import java.math.BigInteger;


@WebService(serviceName = "getAge")

public class AgeService implements generated.ageservice.AgeService {

    @WebMethod
    public String getAge(Integer naissance) {

        return "Votre âge est de " + (2020-naissance) + "ans";
    }
}
