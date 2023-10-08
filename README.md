# Testing-Swag-Labs

<h4>Web Page URL: https://www.saucedemo.com/</h4>
<h4>Programming Languages and Tools:</h4>
<ul>
  <li>Java</li>
  <li>Selenium</li>
  <li>TestNG</li>
</ul>

<h4>Let's test some features under the shopping web site:</h4>
<p>-------------------------------------------------------------------------------------------------------------------------------------------------------------</p>
<li>User Story 001: Log in to the shopping web site.</li>
<p>
  <p><b>As a </b> user, </p>
  <p><b>I want </b> to be able to log in to the system </p>
  <p><b>so that </b> my shopping information can only be accessed by me.</p>
<li>Acceptance Criteria:</li>
<p> 
  <p>- Scenario 1: User can successfully log in</p>
  <p><b>Given </b> I'm a registered user and I'm logged out</p>
  <p><b>When </b> I go to the log in page and enter my user and pasword correctly</p>
  <p><b>Then </b> I can access to the main shopping web page with the data associated to my user</p>
</p>
<p> 
  <p>- Scenario 2: User can not successfully log in</p>
  <p><b>Given </b> I'm a registered user and I'm logged out</p>
  <p><b>When </b> I go to the log in page and enter my user and pasword correctly</p>
  <p><b>Then </b> I can access to the main shopping web page with the data associated to my user</p>
</p>
<p>-------------------------------------------------------------------------------------------------------------------------------------------------------------</p>

<h4>Login with valid credentials (Happy path)</h4>

https://github.com/frausto-jf/Testing-Swag-Labs/assets/78708765/af16b2ed-8d5f-4077-ae3b-43849c2624d2

![image](https://github.com/frausto-jf/Testing-Swag-Labs/assets/78708765/addda61d-e1b1-46b4-82ba-a0e8d82fd5d4)

<p>As expected the test case passed but let's add more test cases to see how the system handle wrong credentials.</p>
