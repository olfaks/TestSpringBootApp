package com.version1.TestSpringBootApp.service;

import org.springframework.stereotype.Service;

@Service
public class PersonFactory {

    private final PrintDetailsPersonService printDetailsPersonService;
    private final SaveToDBPersonService saveToDBPersonService;
    private final DeletePersonService deletePersonService;

    public PersonFactory(PrintDetailsPersonService printDetailsPersonService, SaveToDBPersonService saveToDBPersonService, DeletePersonService deletePersonService) {
        this.printDetailsPersonService = printDetailsPersonService;
        this.saveToDBPersonService = saveToDBPersonService;
        this.deletePersonService = deletePersonService;
    }

    public PersonService returnService(String handleCode) {
        if ("db".equals(handleCode)) {
            return saveToDBPersonService;
        } else if ("print".equals(handleCode)) {
            return printDetailsPersonService;
        } else if ("delete".equals(handleCode)) {
            return deletePersonService;
        }
        return printDetailsPersonService;
    }

}
