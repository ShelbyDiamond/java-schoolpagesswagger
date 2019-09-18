# CourseControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCourseByIdUsingDELETE**](CourseControllerApi.md#deleteCourseByIdUsingDELETE) | **DELETE** /courses/courses/{courseid} | Deletes a course by ID
[**getCountStudentsInCoursesUsingGET**](CourseControllerApi.md#getCountStudentsInCoursesUsingGET) | **GET** /courses/studcount | Retrieves the total students in each course
[**listAllCoursesUsingGET**](CourseControllerApi.md#listAllCoursesUsingGET) | **GET** /courses/courses | returns all Courses with Paging Ability
[**reallyListAllCoursesUsingGET**](CourseControllerApi.md#reallyListAllCoursesUsingGET) | **GET** /courses/allcourses | Retrieves all of the courses without Paging


## **deleteCourseByIdUsingDELETE**

Deletes a course by ID

### Example
```bash
 deleteCourseByIdUsingDELETE courseid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseid** | **integer** | The Course ID |

### Return type

**map**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getCountStudentsInCoursesUsingGET**

Retrieves the total students in each course

### Example
```bash
 getCountStudentsInCoursesUsingGET
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountStudentsInCourses**](CountStudentsInCourses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listAllCoursesUsingGET**

returns all Courses with Paging Ability

### Example
```bash
 listAllCoursesUsingGET  page=value  size=value  Specify as:  sort=value1 sort=value2 sort=...
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

## **reallyListAllCoursesUsingGET**

Retrieves all of the courses without Paging

### Example
```bash
 reallyListAllCoursesUsingGET
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

