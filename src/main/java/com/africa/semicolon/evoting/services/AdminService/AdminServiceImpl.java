package com.africa.semicolon.evoting.services.AdminService;

import com.africa.semicolon.evoting.data.dtos.requests.VoterRegistrationRequest;
import com.africa.semicolon.evoting.data.dtos.responses.VoterRegistrationResponse;
import com.africa.semicolon.evoting.data.models.Voter;
import com.africa.semicolon.evoting.data.repositories.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    private final VoterRepository voterRepository;

    @Autowired
    public AdminServiceImpl(VoterRepository voterRepository) {
        this.voterRepository = voterRepository;
    }


    @Override
    public VoterRegistrationResponse registerVoter(VoterRegistrationRequest voterRegistrationRequest) {
        Voter voter = new Voter();
        voter.setFirstName(voterRegistrationRequest.getFirstName());
        voter.setMiddleName(voterRegistrationRequest.getMiddleName());
        voter.setLastName(voterRegistrationRequest.getLastName());
        voter.setDateOfBirth(voterRegistrationRequest.getDateOfBirth());
        voter.setGender(voterRegistrationRequest.getGender());
        voter.setMaritalStatus(voterRegistrationRequest.getMaritalStatus());
        voter.setOccupation(voterRegistrationRequest.getOccupation());
        voter.setPhoneNumber(voterRegistrationRequest.getPhoneNumber());
        voter.setEmail(voterRegistrationRequest.getEmail());
        voter.setAddress(voterRegistrationRequest.getAddress());
        Voter savedVoter = voterRepository.save(voter);

        VoterRegistrationResponse voterRegistrationResponse
                = new VoterRegistrationResponse();
        voterRegistrationResponse.setPvc(savedVoter.getPvc());
        return voterRegistrationResponse;
    }
}
