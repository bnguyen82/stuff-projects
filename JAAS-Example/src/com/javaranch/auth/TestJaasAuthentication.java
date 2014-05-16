package com.javaranch.auth;

import java.security.Principal;
import java.util.Iterator;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import com.javaranch.SimpleAction;

/**
 *
 * @author Rahul Bhattacharjee
 *
 */
public class TestJaasAuthentication {

	public static void main(String[] args) {
		boolean loginStatus = true;

		CallbackHandler handler = new RanchCallbackHandler();

		try {

			LoginContext loginContext = new LoginContext("RanchLogin" , handler);
			loginContext.login();
			Subject subj = loginContext.getSubject();
			Set<Principal> prinSet = subj.getPrincipals();
			for (Iterator iterator = prinSet.iterator(); iterator.hasNext();) {
				Principal principal = (Principal) iterator.next();
				System.out.print(principal.getName());
			}
			SimpleAction action = new SimpleAction();
			Subject.doAsPrivileged(subj, action, null);
		} catch (LoginException e) {
			loginStatus = false;
		}

		if(loginStatus){
			System.out.println("Login Successful.");
		}else{
			System.out.println("Login Failed.");
		}
	}

}
