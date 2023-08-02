import os
import markdown
FolderList = [
    {
      "path": "Article",
      "mode": "040000",
      "type": "tree",
      "sha": "4e8e9e0aec1b5fc7ed14c007e1bf1cbd7c855113",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/4e8e9e0aec1b5fc7ed14c007e1bf1cbd7c855113"
    },
    {
      "path": "Article/Reading",
      "mode": "040000",
      "type": "tree",
      "sha": "e50a20fd2007dadbb6be12a5b81999f1185454cb",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/e50a20fd2007dadbb6be12a5b81999f1185454cb"
    },
    {
      "path": "Article/Reading/delete.md",
      "mode": "100644",
      "type": "blob",
      "sha": "8b137891791fe96927ad78e64b0aad7bded08bdc",
      "size": 1,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/8b137891791fe96927ad78e64b0aad7bded08bdc"
    },
    {
      "path": "Coding",
      "mode": "040000",
      "type": "tree",
      "sha": "2a27707917037fefa3447d2d5405e89ddf526adf",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/2a27707917037fefa3447d2d5405e89ddf526adf"
    },
    {
      "path": "Coding/Noting",
      "mode": "040000",
      "type": "tree",
      "sha": "0426f5308346605aa49d83b22b11f6c880a37095",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/0426f5308346605aa49d83b22b11f6c880a37095"
    },
    {
      "path": "Coding/Noting/28-FileManage in Matlab.md",
      "mode": "100644",
      "type": "blob",
      "sha": "747ba8bae1b084d54e821ed689faa321f8b96daf",
      "size": 198,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/747ba8bae1b084d54e821ed689faa321f8b96daf"
    },
    {
      "path": "Coding/Noting/Concept definition.md",
      "mode": "100644",
      "type": "blob",
      "sha": "6e6c3a587704373f535d6abb75d1288d58280ea0",
      "size": 113,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/6e6c3a587704373f535d6abb75d1288d58280ea0"
    },
    {
      "path": "Coding/Noting/Leetcode_Algorithms.md",
      "mode": "100644",
      "type": "blob",
      "sha": "7e0a7714cf21b031f1ec3b791d1cf49abbf24c37",
      "size": 985,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/7e0a7714cf21b031f1ec3b791d1cf49abbf24c37"
    },
    {
      "path": "Coding/Noting/Python.md",
      "mode": "100644",
      "type": "blob",
      "sha": "241844795096454d1d3882f7c6f355de8e8ddcb0",
      "size": 518,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/241844795096454d1d3882f7c6f355de8e8ddcb0"
    },
    {
      "path": "EnglishLearning",
      "mode": "040000",
      "type": "tree",
      "sha": "12596934aa82d9d715c435b4548a419865f80935",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/12596934aa82d9d715c435b4548a419865f80935"
    },
    {
      "path": "EnglishLearning/Listening.md",
      "mode": "100644",
      "type": "blob",
      "sha": "8b137891791fe96927ad78e64b0aad7bded08bdc",
      "size": 1,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/8b137891791fe96927ad78e64b0aad7bded08bdc"
    },
    {
      "path": "EnglishLearning/Writing.md",
      "mode": "100644",
      "type": "blob",
      "sha": "2bac4327dd7a9d9a48e28f4417336d2015b1ec40",
      "size": 450,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/2bac4327dd7a9d9a48e28f4417336d2015b1ec40"
    },
    {
      "path": "MITcourse",
      "mode": "040000",
      "type": "tree",
      "sha": "b43661560ab4e3739c71912865bb111e59bfb6ff",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/b43661560ab4e3739c71912865bb111e59bfb6ff"
    },
    {
      "path": "MITcourse/18.05Probability And Statistics",
      "mode": "040000",
      "type": "tree",
      "sha": "45c73451606c342747a452705644a3ee3fe353d1",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/45c73451606c342747a452705644a3ee3fe353d1"
    },
    {
      "path": "MITcourse/18.05Probability And Statistics/C1a.md",
      "mode": "100644",
      "type": "blob",
      "sha": "058307cf8d523b41b154c591a1b6b485a297162c",
      "size": 19,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/058307cf8d523b41b154c591a1b6b485a297162c"
    },
    {
      "path": "MarkDownLanguage.md",
      "mode": "100644",
      "type": "blob",
      "sha": "d8c716275c2d53daaece850cbcb493959e3ea3a4",
      "size": 2091,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/d8c716275c2d53daaece850cbcb493959e3ea3a4"
    },
    {
      "path": "MasterCourse",
      "mode": "040000",
      "type": "tree",
      "sha": "ebbcb9c61e843934b23ebc0c64cc8efa210d19e2",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/ebbcb9c61e843934b23ebc0c64cc8efa210d19e2"
    },
    {
      "path": "MasterCourse/Core",
      "mode": "040000",
      "type": "tree",
      "sha": "f0e1a6593ffa2d80fdf0d562f118f7096b5ae6de",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/f0e1a6593ffa2d80fdf0d562f118f7096b5ae6de"
    },
    {
      "path": "MasterCourse/Core/Adv DataAnalysis Algro.md",
      "mode": "100644",
      "type": "blob",
      "sha": "f2f548ceb8ef05849f4091a7d5469419b5cdb055",
      "size": 133,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/f2f548ceb8ef05849f4091a7d5469419b5cdb055"
    },
    {
      "path": "NoteTaking",
      "mode": "040000",
      "type": "tree",
      "sha": "2a8b489c027e0106ffba3d469c4a751d0b38023a",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/2a8b489c027e0106ffba3d469c4a751d0b38023a"
    },
    {
      "path": "NoteTaking/Collected Web",
      "mode": "040000",
      "type": "tree",
      "sha": "5149c809b4b1f93ce065719c980995df418b4ecd",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/5149c809b4b1f93ce065719c980995df418b4ecd"
    },
    {
      "path": "NoteTaking/Collected Web/CS Learning.md",
      "mode": "100644",
      "type": "blob",
      "sha": "b7d781c5aebcdcd1c48749882836f6eef3b67bd0",
      "size": 68,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/b7d781c5aebcdcd1c48749882836f6eef3b67bd0"
    },
    {
      "path": "NoteTaking/Collected Web/Entertainment.md",
      "mode": "100644",
      "type": "blob",
      "sha": "87367b766eb68bc954d9ab1ad4cdd708102add3b",
      "size": 349,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/87367b766eb68bc954d9ab1ad4cdd708102add3b"
    },
    {
      "path": "NoteTaking/Collected Web/Learning toolds.md",
      "mode": "100644",
      "type": "blob",
      "sha": "2bf7b77882d46e9d2f6120ab51110b8a50d5bc50",
      "size": 621,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/2bf7b77882d46e9d2f6120ab51110b8a50d5bc50"
    },
    {
      "path": "NoteTaking/NeuroScience",
      "mode": "040000",
      "type": "tree",
      "sha": "478cf3375f57c4166e986bbd3f3f72279480c834",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/478cf3375f57c4166e986bbd3f3f72279480c834"
    },
    {
      "path": "NoteTaking/NeuroScience/MethodToAnalysis.md",
      "mode": "100644",
      "type": "blob",
      "sha": "147b4cab0827accb21fb291ce09595612aad6c46",
      "size": 263,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/147b4cab0827accb21fb291ce09595612aad6c46"
    },
    {
      "path": "NoteTaking/NeuroScience/PaperReason.md",
      "mode": "100644",
      "type": "blob",
      "sha": "392ea92216562fde2f5e5f73ee38113eefb5bf9a",
      "size": 946,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/392ea92216562fde2f5e5f73ee38113eefb5bf9a"
    },
    {
      "path": "README.md",
      "mode": "100644",
      "type": "blob",
      "sha": "47cef394c036aa2e000ec84e34453c87223ddc3f",
      "size": 105,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/47cef394c036aa2e000ec84e34453c87223ddc3f"
    },
    {
      "path": "_config.yml",
      "mode": "100644",
      "type": "blob",
      "sha": "c4192631f25b34d77a7f159aa0da0e3ae99c4ef4",
      "size": 26,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/c4192631f25b34d77a7f159aa0da0e3ae99c4ef4"
    },
    {
      "path": "index.html",
      "mode": "100644",
      "type": "blob",
      "sha": "552f2fcff856c92d9f0372c785489452d2e77032",
      "size": 13,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/552f2fcff856c92d9f0372c785489452d2e77032"
    },
    {
      "path": "test",
      "mode": "040000",
      "type": "tree",
      "sha": "cd4a4595e060a616748415e948b8b3941af8e2f3",
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/trees/cd4a4595e060a616748415e948b8b3941af8e2f3"
    },
    {
      "path": "test/2022-06-21-first.md",
      "mode": "100644",
      "type": "blob",
      "sha": "92d9ca2096d06bc54e50bb3d0a60f495b5e8d6be",
      "size": 52,
      "url": "https://api.github.com/repos/Chenbai404/Chenbai404.github.io/git/blobs/92d9ca2096d06bc54e50bb3d0a60f495b5e8d6be"
    }
  ]

path= "E://Coding/Delete/"
#Tar = "1/2022-06-21-first.md"

# #
# #os.mkdir( path + "1")
# # os.mkdir( path + "1/2")
# # os.mkdir( path + path1)
# #NameFold = path + Tar
# open(NameFold[0:-len(NameFold.split("/")[-1])] + NameFold.split("/")[-1],"w")
# print(NameFold[0: -len(NameFold.split("/")[-1]) ])
#   print(type(FolderList[0]['path']))

MaxItem = len(FolderList) - 1


for i in range(0,MaxItem):
    Target = FolderList[i]['path']
    NameFold = path + Target

    if ('size' in FolderList[i].keys()):
        open(NameFold[0: -len(Target.split('/')[-1])] + NameFold.split('/')[-1], "wb")

    else:
        os.mkdir(NameFold)





    # if (Target.find(".") < 0):
    #     os.mkdir(NameFold)
    #
    # elif (i != MaxItem):
    #     AdjustTarget = FolderList[i + 1]['path']
    #
    #     if (AdjustTarget[0:len(Target)-1] == Target):
    #         os.mkdir(NameFold)
    #     elif(Target.find("/") < 0):
    #         open(path + Target, "wb")
    #
    #     else:
    #         open(NameFold[0: -len(Target.split('/')[-1])] + NameFold.split('/')[-1], "wb")


