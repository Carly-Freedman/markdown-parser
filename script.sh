#!/bin/bash
INDEX=1
for file in test-files/*.md;
do
  java MarkdownParse2 $file
  echo $INDEX
  let INDEX=INDEX+1

done