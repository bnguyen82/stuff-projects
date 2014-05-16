package com.javaranch.auth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * CallbackHanlder implementation.
 * 
 * 
 * @author Rahul Bhattacharjee 
 *
 */
public class RanchCallbackHandler implements CallbackHandler{
	public RanchCallbackHandler(){
	}

	public void handle(Callback[] suppliedCallback) throws IOException,UnsupportedCallbackException {

		for (int i = 0; i < suppliedCallback.length; i++) {
            if (suppliedCallback[i] instanceof NameCallback) {
            	System.err.print(((NameCallback)suppliedCallback[i]).getPrompt());
         		System.err.flush();
                    ((NameCallback)suppliedCallback[i]).setName((new BufferedReader
                			(new InputStreamReader(System.in))).readLine());
            }
            else if (suppliedCallback[i] instanceof PasswordCallback) {
            	System.err.print(((PasswordCallback)suppliedCallback[i]).getPrompt());
         		System.err.flush();
                    ((PasswordCallback)suppliedCallback[i]).setPassword((new BufferedReader
                			(new InputStreamReader(System.in))).readLine().toCharArray());
            }
            else {
                throw new UnsupportedCallbackException(suppliedCallback[i]);
            }
        }

	}

}
