package controllers;

import play.*;
import play.data.validation.Valid;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void cadastrar(@Valid Inscricao u) {
    	if (validation.hasErrors()) {
    		params.flash();
            validation.keep();
            index();
    	} else {
    		u.save();
    		flash.success("Inscrição efetuada com sucesso!");
    		index();
    	}
    }

}