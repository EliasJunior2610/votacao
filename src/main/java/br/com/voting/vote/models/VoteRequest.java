package br.com.voting.vote.models;

import java.util.UUID;

public class VoteRequest {
    private UUID associateId;
    private String vote;
    
    //getters e setters
    public UUID getAssociateId() {
        return associateId;
    }
    public void setAssociateId(UUID associateId) {
        this.associateId = associateId;
    }
    public String getVote() {
        return vote;
    }
    public void setVote(String vote) {
        this.vote = vote;
    }

    
    
}
