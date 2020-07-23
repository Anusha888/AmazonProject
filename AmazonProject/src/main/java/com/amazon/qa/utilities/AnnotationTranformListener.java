package com.amazon.qa.utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTranformListener implements IAnnotationTransformer

{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{


		annotation.setRetryAnalyzer(com.amazon.qa.utilities.RetryLogic.class);
	}

	

	
}
