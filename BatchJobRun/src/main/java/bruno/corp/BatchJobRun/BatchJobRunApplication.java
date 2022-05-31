package bruno.corp.BatchJobRun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.context.annotation.Import;






@SpringBootApplication
public class BatchJobRunApplication {


	private  JobScheduler jobScheduler;
	public static void main(String[] args) {
		SpringApplication.run(BatchJobRunApplication.class, args);
	}

}
