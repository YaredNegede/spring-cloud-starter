package com.yared.scopology;

import com.yared.scopology.scopes.Application;
import com.yared.scopology.scopes.Request;
import com.yared.scopology.scopes.Session;
import com.yared.scopology.scopped.BootStrap;
import com.yared.scopology.scopped.LoggedInUser;
import com.yared.scopology.scopped.UserActions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class TagTest {


    @Test
    public void testScope(){

        BootStrap bs = new BootStrap();

        Annotation application = bs.getClass().getAnnotations()[0];

        Assert.isAssignable(Application.class,application.getClass());

        LoggedInUser loggedInUser = new LoggedInUser();

        Annotation session = loggedInUser.getClass().getAnnotations()[0];

        Assert.isAssignable(Session.class,session.getClass());

        UserActions userActions = new UserActions();

        Annotation request = userActions.getClass().getAnnotations()[0];

        Assert.isAssignable(Request.class,request.getClass());


    }

}
