package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.PublicLibraryCard;

public interface PublicLibraryCardService {
	PublicLibraryCard addRecord(PublicLibraryCard librarycard);
	List<PublicLibraryCard>displayAll();
	String deletebyid(long id);
}
