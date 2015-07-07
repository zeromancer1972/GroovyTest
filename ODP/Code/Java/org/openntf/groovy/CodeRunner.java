package org.openntf.groovy;

import groovy.lang.GroovyShell;

import java.io.Serializable;

public class CodeRunner implements Serializable {
	private static final long serialVersionUID = 1L;

	public String runCode(String code) {
		GroovyShell gs = new GroovyShell();
		try {
			Object obj = gs.evaluate(code);
			return obj.toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
