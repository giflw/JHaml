package com.cadrlife.jaml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cadrlife.jaml.filters.CdataFilter;
import com.cadrlife.jaml.filters.EscapedFilter;
import com.cadrlife.jaml.filters.Filter;
import com.cadrlife.jaml.filters.JavaScriptFilter;
import com.cadrlife.jaml.filters.PlainFilter;
import com.cadrlife.jaml.filters.PreserveFilter;

public class JamlConfig {
	List<String> autoclose = new ArrayList<String>(Arrays.asList("meta", "img", "link", "br", "hr", "input", "area", "param", "col", "base"));
	public Map<String,Filter> filters = new HashMap<String,Filter>();
	{
		filters.put("plain", new PlainFilter(this));
		filters.put("javascript", new JavaScriptFilter(this));
		filters.put("cdata", new CdataFilter(this));
		filters.put("escaped", new EscapedFilter(this));
		filters.put("preserve", new PreserveFilter(this));
	}
}
