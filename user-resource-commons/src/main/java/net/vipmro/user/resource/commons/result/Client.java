package net.vipmro.user.resource.commons.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: liuHua
 * @create: 2018-11-24 13:33
 **/

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client implements Serializable {
	private String clientId;
}
