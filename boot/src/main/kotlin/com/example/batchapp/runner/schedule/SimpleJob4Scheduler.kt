package com.example.batchapp.runner.schedule

//import com.example.batchapp.job.incrementer.DateIncrementer
//import com.example.batchapp.utils.LogUtil
//import org.springframework.batch.core.Job
//import org.springframework.batch.core.launch.JobLauncher
//import org.springframework.scheduling.annotation.Scheduled
//import org.springframework.stereotype.Component
//
//@Component
//class SimpleJob4Scheduler constructor(
//    private val jobLauncher: JobLauncher,
//    private val simpleJob4: Job,
//    private val logUtil: LogUtil
//) {
//
//    @Scheduled(cron = "* 0/2 * * * *")
//    fun runJob() {
//
//        logUtil.getLogger().info("started scheduler >>")
//
//        val dateIncrementer = DateIncrementer()
//            .getNext(null)
//
//        jobLauncher.run(simpleJob4, dateIncrementer)
//
//        logUtil.getLogger().info("ended scheduler >>")
//    }
//}
