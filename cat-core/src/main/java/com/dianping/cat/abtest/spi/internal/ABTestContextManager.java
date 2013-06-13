package com.dianping.cat.abtest.spi.internal;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dianping.cat.abtest.ABTestName;
import com.dianping.cat.abtest.spi.ABTestContext;

public interface ABTestContextManager {
	public ABTestContext getContext(ABTestName testName);

	public List<ABTestContext> getContexts();

	public void onRequestBegin(HttpServletRequest request,HttpServletResponse response);

	public void onRequestEnd();
}