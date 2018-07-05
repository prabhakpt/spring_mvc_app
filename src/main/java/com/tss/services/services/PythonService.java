package com.tss.services.services;

import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class PythonService {
	public void callPythonFile() {
		PythonInterpreter python = new PythonInterpreter();
		int number1 = 10;
        int number2 = 32;
        python.set("number1", new PyInteger(number1));
        python.set("number2", new PyInteger(number2));
        python.exec("number3 = number1+number2");
        PyObject number3 = python.get("number3");
        System.out.println("val : "+number3.toString());
	}
}
