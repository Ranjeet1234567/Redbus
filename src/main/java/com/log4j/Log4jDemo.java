package com.log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4jDemo 
{
	public static Logger logger=LogManager.getLogger(Log4jDemo.class);
	public  static  void logge(String a)
	{
		logger.info(a);
	}
}
