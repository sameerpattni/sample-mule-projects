package com.mulesoft.training.soap;

import java.util.Collection;
import javax.jws.WebService;

@WebService
public interface AirportTerminalService {

	public Collection<Terminal> listAllTerminalStatuses();
	public Terminal findTerminalStatus(String terminalNumber);
}
