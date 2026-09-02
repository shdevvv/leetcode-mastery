# Git Commit Template

Use this format for each problem:

```bash
git commit -m "feat: solve #<NUMBER> - <Problem Name>"
```

## Examples

```bash
git commit -m "feat: solve #001 - Contains Duplicate"
git commit -m "feat: solve #002 - Add Two Numbers"
git commit -m "feat: solve #003 - Longest Substring Without Repeating Characters"
git commit -m "feat: solve #004 - Median of Two Sorted Arrays"
git commit -m "feat: solve #005 - Longest Palindromic Substring"
```

## Optional: Add Approach

If you want to include the approach/algorithm:

```bash
git commit -m "feat: solve #001 - Contains Duplicate (HashSet)"
git commit -m "feat: solve #004 - Median Two Arrays (Binary Search)"
```

## Format Breakdown

- `feat:` = feature commit (new solution)
- `solve` = action keyword
- `#<NUMBER>` = problem number (zero-padded)
- `-` = separator
- `<Problem Name>` = problem title from LeetCode
- `(Optional)` = algorithm/approach used
