package com.ewflorencio.JobApp.service;

import com.ewflorencio.JobApp.model.JobPost;
import com.ewflorencio.JobApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository repository;


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repository.returnAllJobPosts();
    }

    public void addJobPost(JobPost jobPost) {
        repository.addJobPost(jobPost);

    }

}
