$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/UDEMY_SELENIUMJAVA/SeleniumCucumber/src/test/java/com/seleniumcucumber/features/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the amazon application",
  "description": "",
  "id": "validate-the-amazon-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "SEt up the environment",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Launches the website",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.browser_is_opened()"
});
formatter.result({
  "duration": 5234378600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.launches_the_website()"
});
formatter.result({
  "duration": 8442037100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check the amazon application is loaded and the tilte",
  "description": "",
  "id": "validate-the-amazon-application;check-the-amazon-application-is-loaded-and-the-tilte",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Fetch the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 56798600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.fetch_the_Title()"
});
formatter.result({
  "duration": 54851000,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "SEt up the environment",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Launches the website",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.browser_is_opened()"
});
formatter.result({
  "duration": 1313137000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.launches_the_website()"
});
formatter.result({
  "duration": 8392827300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search for an item",
  "description": "",
  "id": "validate-the-amazon-application;search-for-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on Amazon Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User selects Book as Category",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Type Jayakumaran in Search box",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Amazon_Page()"
});
formatter.result({
  "duration": 47600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_Book_as_Category()"
});
formatter.result({
  "duration": 460348500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.type_Jayakumaran_in_Search_box()"
});
formatter.result({
  "duration": 5243378600,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "SEt up the environment",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Launches the website",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.browser_is_opened()"
});
formatter.result({
  "duration": 1439629300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.launches_the_website()"
});
formatter.result({
  "duration": 40491136900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Fetch all the links in Footer",
  "description": "",
  "id": "validate-the-amazon-application;fetch-all-the-links-in-footer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "User is on Amazon Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Get all the links in the footer page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Amazon_Page()"
});
formatter.result({
  "duration": 70300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.get_all_the_links_in_the_footer_page()"
});
formatter.result({
  "duration": 37857800,
  "status": "passed"
});
});