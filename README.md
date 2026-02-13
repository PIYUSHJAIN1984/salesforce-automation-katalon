# Salesforce Automation Project (Katalon Studio)

## 📌 Project Overview
This repository contains a comprehensive automated testing suite for **Salesforce**, developed using **Katalon Studio**. The project demonstrates the ability to automate Salesforce workflows, handle dynamic web elements, and implement data-driven testing strategies.

**Target Application:** Salesforce Demo / Developer Environment  
**Tooling:** Katalon Studio [10.4.3] (Trial License)

---

## 🚀 Key Features & Capabilities
I utilized advanced Katalon features to build automation test scripts and framework:

* **Standard & Custom Objects:** Automated end-to-end flows for **Accounts**, **Contacts**, **Opportunities**, **Leads** and **Case** as well as specialized **Custom Objects**.
* **Data-Driven Testing (DDT):** Integrated **Data Files** to execute test cases with multiple sets of data, increasing test coverage.
* **Dynamic Locators:** Implemented robust XPath and CSS strategies to handle Salesforce's dynamic element IDs and complex DOM structures.
* **Object Repository:** Maintained a clean, organized hierarchy of web elements for high reusability.
* **Execution Profiles:** Used profiles to manage environment-specific variables like URLs and credentials.

---

## 🛠️ Automated Test Scenarios
| Module | Description | Features Used |
| :--- | :--- | :--- |
| **Accounts** | Creation, validation, editing , search and Deletion of Account records. | Web UI Keywords |
| **Contacts** | Linking Contacts to Accounts, updating title of Contacts , Search and Deletion of contact records. | Web UI Keywords|
| **Opportunities** | Create opportunity from Contact, Edit opportunity details, Search and deletion of opportunity. | Web UI Keywords |
| **Leads** | Create Leads , validation of Lead Status dropdown values and change status of Lead. | Web UI Keywords |
| **Case** | Create Case , update Case status for new or existing cases. | Web UI Keywords |
| **Custom Objects** | Created customized xpaths for dynamic locators to avoid script maintenance. | Dynamic XPaths |

---

## 📁 Project Structure
* **Test Cases:** Logical grouping of scripts by Salesforce module.
* **Object Repository:** Centralized storage for all UI elements.
* **Data Files:** Internal sheets used for driving automated inputs.
* **Test Suites:** Collections and Test Suite of test cases created 

---

## ⚙️ Setup & Execution
1.  **Clone the Repo:** `git clone <your-repo-url>`
2.  **Open in Katalon:** Launch Katalon Studio and select **File > Open Project**.
3.  **WebDriver:** Ensure your Chrome/Edge drivers are updated via `Tools > Update WebDrivers`.
4.  **Credentials:** Update the `default` Execution Profile with your Salesforce trial credentials before running tests.

---

## 📝 Skills Demonstrated
* Parameterization of test scripts for scalability.
* Professional Git workflow and repository management.
* Handling asynchronous loading (AJAX) using smart Wait statements.
* Created Custom Keywords to automatically handle Salesforce navigation after login, ensuring tests start smoothly every time without manual intervention.
* Using trial license I have also completed **Katalon Practitioner Certification**
