package net.vipmro.user.resource.web.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@Component
@NoArgsConstructor
public class MapTemplateUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(MapTemplateUtils.class);
	
	private static final String mongodbCollectionsName = "sso_log";
	private static MongoTemplate mongoTemplate;
	
	public static void mongodbLogHttpRequest(String host, String requestPath, String httpRequestUrl, Date requestTime, Date endTime, int responseStatusCode, String requestBody, String responseMsg) {
		Map<String, Object> map = new HashMap();
		map.put("request_host", host);
		map.put("request_path", requestPath);
		map.put("http_request_url", httpRequestUrl);
		map.put("request_time", requestTime);
		map.put("end_time", endTime);
		map.put("response_status_code", responseStatusCode);
		map.put("request body", requestBody);
		map.put("response_msg", responseMsg);
		try {
			mongoTemplate.save(map, mongodbCollectionsName);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}
	
	@Autowired
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		MapTemplateUtils.mongoTemplate = mongoTemplate;
	}
	
}
