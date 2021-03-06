/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Health;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-03T16:14:43.095400-08:00[America/Los_Angeles]")

@Validated
@Api(value = "health", description = "the health API")
public interface HealthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /health : Get Health
     * Get the health of the API
     *
     * @return Success (status code 200)
     *         or Unauthorized (status code 403)
     *         or The specified resource was not found (status code 404)
     */
    @ApiOperation(value = "Get Health", nickname = "health", notes = "Get the health of the API", response = Health.class, tags={ "Health", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = Health.class),
        @ApiResponse(code = 403, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class) })
    @RequestMapping(value = "/health",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Health> health() {
        // getRequest().ifPresent(request -> {
        //     for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        //         if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
        //             String exampleString = "{ \"status\" : \"pass\" }";
        //             ApiUtil.setExampleResponse(request, "application/json", exampleString);
        //             break;
        //         }
        //     }
        // });
        Health health = new Health().status(Health.StatusEnum.PASS);
        return new ResponseEntity<Health>(health, HttpStatus.OK);
    }

}
