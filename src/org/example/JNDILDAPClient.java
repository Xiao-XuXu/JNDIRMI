package org.example;

import javax.naming.InitialContext;

public class JNDILDAPClient {
    public static void main(String[] args) throws Exception{
        InitialContext initialContext=new InitialContext();
        initialContext.lookup("ldap://localhost:10389/cn=test,dc=example,dc=com");
    }
}
