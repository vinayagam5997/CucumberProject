$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataTableWithheadings.feature");
formatter.feature({
  "line": 1,
  "name": "to orangeHrm",
  "description": "",
  "id": "to-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "going to OrangeHrm website",
  "description": "",
  "id": "to-orangehrm;going-to-orangehrm-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "on login page of Orangehrm",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "entering the credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 5
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Datatablewithheader.on_login_page_of_Orangehrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Datatablewithheader.entering_the_credentials(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Datatablewithheader.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Examples.feature");
formatter.feature({
  "line": 1,
  "name": "orangeHrm website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "going to OrangeHrm website",
  "description": "",
  "id": "orangehrm-website;going-to-orangehrm-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "login page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "credentials validating \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "login button click",
  "keyword": "And "
});
formatter.examples({
  "line": 6,
  "name": "",
  "description": "",
  "id": "orangehrm-website;going-to-orangehrm-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7,
      "id": "orangehrm-website;going-to-orangehrm-website;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 8,
      "id": "orangehrm-website;going-to-orangehrm-website;;2"
    },
    {
      "cells": [
        "Admin",
        "admin555"
      ],
      "line": 9,
      "id": "orangehrm-website;going-to-orangehrm-website;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 8,
  "name": "going to OrangeHrm website",
  "description": "",
  "id": "orangehrm-website;going-to-orangehrm-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "login page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "credentials validating \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "login button click",
  "keyword": "And "
});
formatter.match({
  "location": "examples.login_page_of_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 24
    },
    {
      "val": "admin123",
      "offset": 36
    }
  ],
  "location": "examples.credentials_validating_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "examples.login_button_click()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "going to OrangeHrm website",
  "description": "",
  "id": "orangehrm-website;going-to-orangehrm-website;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "login page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "credentials validating \"Admin\" and \"admin555\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "login button click",
  "keyword": "And "
});
formatter.match({
  "location": "examples.login_page_of_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 24
    },
    {
      "val": "admin555",
      "offset": 36
    }
  ],
  "location": "examples.credentials_validating_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "examples.login_button_click()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Sendingdataviadata_table.feature");
formatter.feature({
  "line": 1,
  "name": "orangeHrm",
  "description": "",
  "id": "orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "OrangeHrm website",
  "description": "",
  "id": "orangehrm;orangehrm-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "on login page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "entering the  valid credentials",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 5
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicking login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "moving to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatablewithoutheader.on_login_page_of_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Datatablewithoutheader.entering_the_valid_credentials(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Datatablewithoutheader.clicking_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Datatablewithoutheader.moving_to_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("loginwithdata.feature");
formatter.feature({
  "line": 1,
  "name": "going to orangeHrm",
  "description": "",
  "id": "going-to-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "navigating to OrangeHrm website",
  "description": "",
  "id": "going-to-orangehrm;navigating-to-orangehrm-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on login page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user giving valid credentials\"Admin\"and \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user will see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginParameter.user_is_on_login_page_of_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 30
    },
    {
      "val": "admin123",
      "offset": 41
    }
  ],
  "location": "LoginParameter.user_giving_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginParameter.user_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginParameter.user_will_see_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("opengoogle.feature");
formatter.feature({
  "line": 1,
  "name": "to test the google website",
  "description": "",
  "id": "to-test-the-google-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "google search scenario",
  "description": "",
  "id": "to-test-the-google-website;google-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is entering google.co.in",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user give some text in search box \"bikes\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user press enter key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user should see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "opengoogleDefinitions.user_is_entering_google_co_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "bikes",
      "offset": 35
    }
  ],
  "location": "opengoogleDefinitions.user_give_some_text_in_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "opengoogleDefinitions.user_press_enter_key()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "opengoogleDefinitions.user_should_see_the_search_results()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("orangeHrm.feature");
formatter.feature({
  "line": 1,
  "name": "going to website orangeHrm",
  "description": "",
  "id": "going-to-website-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "going to the OrangeHrm website",
  "description": "",
  "id": "going-to-website-orangehrm;going-to-the-orangehrm-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user giving valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicking on login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user navigates to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Orangelogin.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangelogin.user_giving_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangelogin.user_clicking_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Orangelogin.user_navigates_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
});