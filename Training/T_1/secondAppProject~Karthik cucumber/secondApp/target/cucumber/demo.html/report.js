$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/cc/secondApp/secondApp.feature");
formatter.feature({
  "line": 1,
  "name": "SecondApp is a application we are trying for the second time.",
  "description": "",
  "id": "secondapp-is-a-application-we-are-trying-for-the-second-time.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "A simple calculator to do additions",
  "description": "",
  "id": "secondapp-is-a-application-we-are-trying-for-the-second-time.;a-simple-calculator-to-do-additions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SecondApp"
    },
    {
      "line": 3,
      "name": "@Sanity"
    },
    {
      "line": 3,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "two numbers 1 and 2",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "adding up the numbers",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the result should yield 3",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 12
    },
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "SecondApp.two_numbers_and(int,int)"
});
formatter.result({
  "duration": 801190616,
  "status": "passed"
});
formatter.match({
  "location": "SecondApp.adding_up_the_numbers()"
});
formatter.result({
  "duration": 95754,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 24
    }
  ],
  "location": "SecondApp.the_result_should_yield(int)"
});
formatter.result({
  "duration": 20648122,
  "status": "passed"
});
});