#!/bin/sh -e

printUsage() {
   echo "Usage : "
   echo "./merge.sh SHA1 RESULTING_BRANCH"
   echo "    SHA1: SHA1 to merge with trunk"
   echo "    RESULTING_BRANCH : Resulting branch of the merge"
   exit 1
}

if [ "$#" -ne 2 ]; then
    printUsage
fi

SHA1=$1
RESULTING_BRANCH=$2

APACHE_REPO=`git remote show | grep apache || true`
if [ -z "$APACHE_REPO" ]; then
    git remote add apache https://github.com/apache/james-project.git
fi 
git fetch apache
git checkout apache/trunk -b trunk

git fetch origin
git checkout $SHA1 -b SHA1_BRANCH

git checkout trunk
git checkout -b $RESULTING_BRANCH
git merge --no-edit SHA1_BRANCH
