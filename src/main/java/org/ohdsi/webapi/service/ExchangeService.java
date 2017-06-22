package org.ohdsi.webapi.service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.ohdsi.webapi.cohortdefinition.CohortDefinition;
import org.ohdsi.webapi.cohortdefinition.CohortDefinitionRepository;
import org.ohdsi.webapi.dto.CommonCohortDefinitionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("/exchange")
@Component
public class ExchangeService extends AbstractDaoService {

    private final CohortDefinitionRepository cohortDefinitionRepository;

    @Autowired
    public ExchangeService(CohortDefinitionRepository cohortDefinitionRepository) {

        this.cohortDefinitionRepository = cohortDefinitionRepository;
    }

    @Path("cohortdefinition")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CommonCohortDefinitionDTO> cohortDefinitionList(){
        List<CohortDefinition> cohortDefinitions = cohortDefinitionRepository.list();
        List<CommonCohortDefinitionDTO> result = new LinkedList<>();
        for(CohortDefinition cd : cohortDefinitions){
            CommonCohortDefinitionDTO dto = new CommonCohortDefinitionDTO(cd);
            result.add(dto);
        }
        return result;
//        return cohortDefinitions.stream().map(CommonCohortDefinitionDTO::new).collect(Collectors.toList());
    }

    @Path("cohortdefinition/{guid}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CommonCohortDefinitionDTO getCohortDefinition(@PathParam("guid") String guid){
        CohortDefinition cd = cohortDefinitionRepository.findByGuidWithDetails(guid);
        if (cd == null){
            throw new NotFoundException(String.format("Cohort Definition with GUID:%s was not found", guid));
        }
        return new CommonCohortDefinitionDTO(cd);
    }
}
