# StudentControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewStudentUsingPOST**](StudentControllerApi.md#addNewStudentUsingPOST) | **POST** /students/Student | Creates a new Student
[**deleteStudentByIdUsingDELETE**](StudentControllerApi.md#deleteStudentByIdUsingDELETE) | **DELETE** /students/Student/{Studentid} | Deletes an existing student
[**getStudentByIdUsingGET**](StudentControllerApi.md#getStudentByIdUsingGET) | **GET** /students/Student/{StudentId} | Retrieves a student associated with the student ID
[**getStudentByNameContainingUsingGET**](StudentControllerApi.md#getStudentByNameContainingUsingGET) | **GET** /students/student/namelike/{name} | Returns all Students matching a certain string
[**listAllStudentsUsingGET**](StudentControllerApi.md#listAllStudentsUsingGET) | **GET** /students/students | returns all Students with Paging Ability
[**reallyListAllStudentsUsingGET**](StudentControllerApi.md#reallyListAllStudentsUsingGET) | **GET** /students/allstudents | Retrieves all of the students without Paging
[**updateStudentUsingPUT**](StudentControllerApi.md#updateStudentUsingPUT) | **PUT** /students/Student/{Studentid} | Updates an existing student


## **addNewStudentUsingPOST**

Creates a new Student

The newly created student ID will be sent in the location header

### Example
```bash
 addNewStudentUsingPOST
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newStudent** | [**Student**](Student.md) | newStudent |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteStudentByIdUsingDELETE**

Deletes an existing student

### Example
```bash
 deleteStudentByIdUsingDELETE Studentid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentid** | **integer** | The students ID |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getStudentByIdUsingGET**

Retrieves a student associated with the student ID

### Example
```bash
 getStudentByIdUsingGET StudentId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **integer** | Student id |

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getStudentByNameContainingUsingGET**

Returns all Students matching a certain string

### Example
```bash
 getStudentByNameContainingUsingGET name=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | Part or all of the student name |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllStudentsUsingGET**

returns all Students with Paging Ability

### Example
```bash
 listAllStudentsUsingGET  page=value  size=value  Specify as:  sort=value1 sort=value2 sort=...
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**Object**](.md) | Results page you want to retrieve (0..N) | [optional]
 **size** | [**Object**](.md) | Number of records per page. | [optional]
 **sort** | [**array[string]**](string.md) | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **reallyListAllStudentsUsingGET**

Retrieves all of the students without Paging

### Example
```bash
 reallyListAllStudentsUsingGET
```

### Parameters
This endpoint does not need any parameter.

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateStudentUsingPUT**

Updates an existing student

### Example
```bash
 updateStudentUsingPUT Studentid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentid** | **integer** | Studentid |
 **updateStudent** | [**Student**](Student.md) | updateStudent |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

