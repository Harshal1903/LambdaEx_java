package org.file.LambdaEx;

import java.util.List;

public interface TransactionFilter {
	
	public List<Transaction> doFilter(List<Transaction> originalList);

}
