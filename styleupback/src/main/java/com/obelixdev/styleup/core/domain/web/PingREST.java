package com.obelixdev.styleup.core.domain.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** Servicio rest que permite testear el estado del microservicio
 * @author jorgguca */
@RestController
@RequestMapping(value = "/styleup/ping")
public class PingREST {
	
		private static final Logger LOG = LoggerFactory.getLogger(PingREST.class);

	
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<?> getPingOnGet() {

			try {
				return new ResponseEntity<>("StyleUp is OK!", HttpStatus.OK);
			} catch (Exception e) {
				LOG.debug("Se presentó error intentando hacer ping a StyleUp", e);
				LOG.error("Se presentó error intentando hacer ping a StyleUp", e);
				return new ResponseEntity<>("StyleUp is OK!", HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}


		@RequestMapping(method = RequestMethod.POST)
		public ResponseEntity<?> getPingOnPost() {
			try {
				return getPingOnGet();
			} catch (Exception e) {
				LOG.debug("Se presentó error intentando hacer ping a StyleUp", e);
				LOG.error("Se presentó error intentando hacer ping a StyleUp", e);
				return new ResponseEntity<>("StyleUp is OK!", HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}

	
}
