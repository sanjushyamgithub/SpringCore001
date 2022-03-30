package in.nareshit.ragu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

	private List<String> data;
	private Set<String> models;
	private Map<Integer, String> modes;
	private Properties context;
}
