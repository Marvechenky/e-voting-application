package com.africa.semicolon.evoting.services.AdminService;

import com.africa.semicolon.evoting.data.dtos.requests.VoterRegistrationRequest;
import com.africa.semicolon.evoting.data.dtos.responses.VoterRegistrationResponse;


public interface AdminService {

    VoterRegistrationResponse registerVoter(VoterRegistrationRequest voterRegistrationRequest);


}
