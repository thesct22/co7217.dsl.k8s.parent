del /f co7217_checked

IF EXIST co7217.dsl.ucd\submission_helper\solutions.dat (
	echo $null >> co7217_checked
	gradlew wrapper --gradle-version=6.6.1
	gradlew clean test
	del /f submission.zip
	powershell "Compress-Archive . submission.zip"
) ELSE (
    echo Could not find ./co7217.dsl.ucd/submission_helper/solutions.dat Please download the project template with this folder and execute the method SubmissionHelper.check_solution()
)