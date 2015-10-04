package com.dnt.ftp;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;

@Stateless
public class EpayScheduler {
	@EJB
	EpayFtpEdi ftpEdi;

    /**
     * Default constructor. 
     */
    public EpayScheduler() {
        // TODO Auto-generated constructor stub
    }
	
	@Schedule(minute="*/2", hour="*", dayOfWeek="Mon-Fri",
      dayOfMonth="*", month="*", year="*")
    private void scheduledTimeout(final Timer t) {
        System.out.println("@Schedule called at: " + new java.util.Date());
        ftpEdi.grapEdi();
    }
}