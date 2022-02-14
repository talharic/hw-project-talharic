package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobPosting;
import com.example.hrms.entities.concretes.dtos.JobPostingWithEmployerAndJobTitleDto;

import java.util.List;

public interface JobPostingService extends BaseEntityService<JobPosting> {

    DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getAllActiveJobPostingDetails();

    DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getAllActiveJobPostingDetailsSortedByPostingDate();

    DataResult<List<JobPostingWithEmployerAndJobTitleDto>> getAllActiveJobPostingDetailsByCompanyName(String companyName);

}