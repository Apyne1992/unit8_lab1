# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name
Aloysius Pyne

## GitHub Repository URL
https://github.com/Apyne1992/unit8_lab1/

---

# Commit 1: Initial Commit

## What did you include in this commit?
- All starter project files (`BuggyProgram.java`, `Task1Test.java`, `Task2Test.java`, `Task3Test.java`, and `README.md`) before making any code changes.

## What was the purpose of this commit?
- To establish a clean baseline snapshot of the original project in Git version control before beginning any debugging or modifications.

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
- The boundary and threshold tests for scores that should return `"Exceeds"` and `"Meets"` (such as `90` and `80`) were failing.

## What was the issue in the code?
- The nested conditional statements had incorrect threshold comparisons and/or flipped branch logic, causing valid scores at or above the cutoff boundaries to return the wrong grade classification.

## What change did you make to fix it?
- Corrected the nested `if-else` conditions in `getGrade` so that scores `>= 90` return `"Exceeds"`, scores `>= 80` (and below 90) return `"Meets"`, and all lower scores return `"Does Not Meet"`.

## How did the tests help guide your fix?
- The JUnit failure messages showed the exact input scores and the mismatch between the expected string output and actual returned value, pinpointing which conditional boundary was misconfigured.

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
- Tests checking arrays containing a mix of even and odd integers (as well as edge cases like all-odd arrays or negative even numbers) were failing.

## What was the issue in the code?
- The loop in `sumEvenNumbers` either checked the wrong parity condition (such as summing odd numbers or index positions instead of element values) or failed to accumulate all matching elements properly.

## What change did you make to fix it?
- Updated the `for` loop to iterate through every element `values[i]` in the array and add `values[i]` to `sum` only when `values[i] % 2 == 0`.

## How did the tests help guide your fix?
- Comparing the test inputs against the returned sums made it clear that non-even values were being included (or even values were being skipped), confirming the modulo check needed to be fixed.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
- Tests verifying standard inclusive ranges (such as summing from `start` to `end` where the upper bound `end` must be included in the total) were failing.

## What was the issue in the code?
- The loop in `sumRange` had an off-by-one boundary error (using `<` instead of `<=`), causing the loop to stop one number short and exclude `end` from the total.

## What change did you make to fix it?
- Changed the loop condition in `sumRange` from `i < end` to `i <= end` so both `start` and `end` are included in the sum.

## How did the tests help guide your fix?
- The difference between the expected sum and actual sum in `Task3Test` was consistently equal to the value of `end`, which immediately pointed to an inclusive vs. exclusive upper-bound error.

---

# Overall Reflection

## Which task was the easiest to fix? Why?
- Task 3 (`sumRange`) was the easiest to fix because the discrepancy between expected and actual outputs directly revealed a single off-by-one loop condition (`<` vs. `<=`).

## Which task was the most difficult? Why?
- Task 1 (`getGrade`) required the most careful attention because nested conditionals require checking every boundary value (`80` and `90`) to ensure no branch overlaps or skips a grade tier.

## How did Git help you track your progress through the debugging process?
- Git created a clear, chronological record of each individual bug fix and allowed me to verify via diffs exactly which lines changed between test runs.

## Why is it important to make small, frequent commits when debugging code?
- Small, single-purpose commits isolate each change so that if a fix introduces a new bug, you can easily identify the exact commit responsible and revert or adjust it without losing unrelated progress.

## What did you learn about using JUnit tests to guide debugging?
- Running targeted unit tests after each small edit provides immediate, objective confirmation that a bug is resolved and ensures existing functionality does not break.

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
- I verified that all three methods in `BuggyProgram.java` pass their JUnit test suites, added my student name and GitHub repository URL, and completed all commit and overall reflection questions in `README.md`.

## Why is it useful to document your work after completing a programming task?
- Clear documentation explains the reasoning behind code changes, creates a reference for future maintenance or debugging, and helps teammates or reviewers quickly understand how the solution was verified.
