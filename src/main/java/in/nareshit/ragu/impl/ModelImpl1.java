package in.nareshit.ragu.impl;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ModelImpl1 implements IModel {

	public String m() {
		return "ModelImpl1 class's m() method.." ;
	}
}
