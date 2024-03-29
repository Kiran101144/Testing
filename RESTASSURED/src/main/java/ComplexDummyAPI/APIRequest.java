package ComplexDummyAPI;

public class APIRequest {

	public static String api() {
		String str = "{\r\n" + "  \"medications\": [\r\n" + "    {\r\n" + "      \"aceInhibitors\": [\r\n"
				+ "        {\r\n" + "          \"name\": \"lisinopril\",\r\n"
				+ "          \"strength\": \"10 mg Tab\",\r\n" + "          \"dose\": \"1 tab\",\r\n"
				+ "          \"route\": \"PO\",\r\n" + "          \"sig\": \"daily\",\r\n"
				+ "          \"pillCount\": \"#90\",\r\n" + "          \"refills\": \"Refill 3\"\r\n" + "        }\r\n"
				+ "      ],\r\n" + "      \"antianginal\": [\r\n" + "        {\r\n"
				+ "          \"name\": \"nitroglycerin\",\r\n"
				+ "          \"strength\": \"0.4 mg Sublingual Tab\",\r\n" + "          \"dose\": \"1 tab\",\r\n"
				+ "          \"route\": \"SL\",\r\n" + "          \"sig\": \"q15min PRN\",\r\n"
				+ "          \"pillCount\": \"#30\",\r\n" + "          \"refills\": \"Refill 1\"\r\n" + "        }\r\n"
				+ "      ],\r\n" + "      \"anticoagulants\": [\r\n" + "        {\r\n"
				+ "          \"name\": \"warfarin sodium\",\r\n" + "          \"strength\": \"3 mg Tab\",\r\n"
				+ "          \"dose\": \"1 tab\",\r\n" + "          \"route\": \"PO\",\r\n"
				+ "          \"sig\": \"daily\",\r\n" + "          \"pillCount\": \"#90\",\r\n"
				+ "          \"refills\": \"Refill 3\"\r\n" + "        }\r\n" + "      ],\r\n"
				+ "      \"betaBlocker\": [\r\n" + "        {\r\n" + "          \"name\": \"metoprolol tartrate\",\r\n"
				+ "          \"strength\": \"25 mg Tab\",\r\n" + "          \"dose\": \"1 tab\",\r\n"
				+ "          \"route\": \"PO\",\r\n" + "          \"sig\": \"daily\",\r\n"
				+ "          \"pillCount\": \"#90\",\r\n" + "          \"refills\": \"Refill 3\"\r\n" + "        }\r\n"
				+ "      ],\r\n" + "      \"diuretic\": [\r\n" + "        {\r\n"
				+ "          \"name\": \"furosemide\",\r\n" + "          \"strength\": \"40 mg Tab\",\r\n"
				+ "          \"dose\": \"1 tab\",\r\n" + "          \"route\": \"PO\",\r\n"
				+ "          \"sig\": \"daily\",\r\n" + "          \"pillCount\": \"#90\",\r\n"
				+ "          \"refills\": \"Refill 3\"\r\n" + "        }\r\n" + "      ],\r\n"
				+ "      \"mineral\": [\r\n" + "        {\r\n" + "          \"name\": \"potassium chloride ER\",\r\n"
				+ "          \"strength\": \"10 mEq Tab\",\r\n" + "          \"dose\": \"1 tab\",\r\n"
				+ "          \"route\": \"PO\",\r\n" + "          \"sig\": \"daily\",\r\n"
				+ "          \"pillCount\": \"#90\",\r\n" + "          \"refills\": \"Refill 3\"\r\n" + "        }\r\n"
				+ "      ]\r\n" + "    }\r\n" + "  ],\r\n" + "  \"labs\": [\r\n" + "    {\r\n"
				+ "      \"name\": \"Arterial Blood Gas\",\r\n" + "      \"time\": \"Today\",\r\n"
				+ "      \"location\": \"Main Hospital Lab\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"BMP\",\r\n" + "      \"time\": \"Today\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"BNP\",\r\n" + "      \"time\": \"3 Weeks\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"BUN\",\r\n" + "      \"time\": \"1 Year\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"Cardiac Enzymes\",\r\n" + "      \"time\": \"Today\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"CBC\",\r\n" + "      \"time\": \"1 Year\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"Creatinine\",\r\n" + "      \"time\": \"1 Year\",\r\n"
				+ "      \"location\": \"Main Hospital Lab\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"Electrolyte Panel\",\r\n" + "      \"time\": \"1 Year\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"Glucose\",\r\n" + "      \"time\": \"1 Year\",\r\n"
				+ "      \"location\": \"Main Hospital Lab\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"PT/INR\",\r\n" + "      \"time\": \"3 Weeks\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"PTT\",\r\n" + "      \"time\": \"3 Weeks\",\r\n"
				+ "      \"location\": \"Coumadin Clinic\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"TSH\",\r\n" + "      \"time\": \"1 Year\",\r\n"
				+ "      \"location\": \"Primary Care Clinic\"\r\n" + "    }\r\n" + "  ],\r\n" + "  \"imaging\": [\r\n"
				+ "    {\r\n" + "      \"name\": \"Chest X-Ray\",\r\n" + "      \"time\": \"Today\",\r\n"
				+ "      \"location\": \"Main Hospital Radiology\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"Chest X-Ray\",\r\n" + "      \"time\": \"Today\",\r\n"
				+ "      \"location\": \"Main Hospital Radiology\"\r\n" + "    },\r\n" + "    {\r\n"
				+ "      \"name\": \"Chest X-Ray\",\r\n" + "      \"time\": \"Today\",\r\n"
				+ "      \"location\": \"Main Hospital Radiology\"\r\n" + "    }\r\n" + "  ]\r\n" + "}";
		
		return str;
	}
}