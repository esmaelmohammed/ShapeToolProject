**ShapeTool SOAP Web Service – Documentation**

 

**Student Name:** Esmael Mohammed

**ID Number:** 1301067

**University:** Woldia University

**Department:** Software Engineering

**Course:** Web Service

**Instructor:** Demeke G.

**Submission Date:** April 2026


---

  

**---**

**1. Introduction**
The ShapeTool project is a SOAP-based web service developed to calculate the area of various geometric shapes. The system demonstrates the principles of Service-Oriented Architecture (SOA), SOAP messaging, XML Schema (XSD), and WSDL-based service definition using a contract-first approach.

---

**2. Design Decisions**
A contract-first approach was used, where the XML Schema (XSD) was designed before implementing the service logic. This ensures that the service structure is well-defined and independent of implementation. Each shape operation was designed as a separate method to maintain clarity and modularity.

---

**3. XML Schema (XSD) Structure**
The XSD defines request and response messages for each operation:

* circleAreaRequest / circleAreaResponse
* squareAreaRequest / squareAreaResponse
* rectangleAreaRequest / rectangleAreaResponse
* parallelogramAreaRequest / parallelogramAreaResponse
* triangleAreaRequest / triangleAreaResponse

Each request contains only the required parameters, and each response returns the calculated area.

A custom simple type `positiveDouble` was created to restrict values using:

* `xs:minInclusive = 0`

This ensures no negative values are accepted.

---

**4. Namespace Usage**
The namespace used is:
`http://example.com/shapetool`

This namespace uniquely identifies the service elements and avoids naming conflicts. It is consistently used in XSD, WSDL, and SOAP messages.

---

**5. WSDL Description**
The WSDL file defines:

* Service name: ShapeToolService
* Operations: circleArea, squareArea, rectangleArea, parallelogramArea, triangleArea
* Message structure based on XSD
* Binding style: document/literal

Each operation includes input and output messages mapped to the schema elements.

---

**6. Service Operation Design**
Each operation is implemented as a separate method in Java:

* circleArea(radius)
* squareArea(side)
* rectangleArea(length, width)
* parallelogramArea(base, height)
* triangleArea(base, height)

Each method calculates area using the correct mathematical formula and returns the result.

---

**7. Validation Strategy**
Validation is implemented in two ways:

1. **Schema-level validation (XSD)**

   * Prevents negative values using `minInclusive`

2. **Application-level validation (Java)**

   * Throws exceptions if invalid inputs are provided

This ensures robust validation at both levels.

---

**8. Error Handling (SOAP Faults)**
Invalid inputs such as negative values trigger exceptions in the Java code. These exceptions are automatically converted into SOAP Fault messages, which inform the client about the error.

---

**9. Testing**
The web service was tested using Postman. SOAP XML requests were sent for all operations, and correct responses were received:

* Circle → 78.53
* Square → 16
* Rectangle → 15
* Parallelogram → 24
* Triangle → 12

All results were verified using standard mathematical formulas.

---

**10. Conclusion**
The ShapeTool SOAP web service successfully demonstrates the use of XSD, WSDL, and SOAP in a service-oriented architecture. The system is fully functional, validated, and tested with correct outputs.
