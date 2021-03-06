package com.twitter.clone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitter.clone.entity.Tweet;
import com.twitter.clone.entity.User;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {
	
	List<Tweet> findAllByUserOrderByCreatedAtDesc(User user); 
}
